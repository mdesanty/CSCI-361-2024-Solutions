package assignments.sets_and_maps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FacebookLikeManager {
    private Map<String, List<String>> likesFor;
    private Map<String, List<String>> likesBy;

    public FacebookLikeManager(String filePath) throws IOException {
        likesFor = new HashMap<>();
        likesBy = new HashMap<>();
        loadFile(filePath);
    }

    public List<String> getAllUsers() {
        Set<String> users = new HashSet<>();
        users.addAll(likesFor.keySet());
        users.addAll(likesBy.keySet());

        List<String> allUsers = new ArrayList<>();
        allUsers.addAll(users);

        return allUsers;
    }

    public List<String> getLikes(String user) {
        return likesFor.get(user);
    }

    public List<String> getLikedBy(String user) {
        return likesBy.get(user);
    }

    private void loadFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            while (line != null) {
                processLine(line);
                line = reader.readLine();
            }
        }
    }

    private void processLine(String line) {
        String[] lineData = line.split(":|,");
        String user = lineData[0];

        List<String> likers = new ArrayList<>();
        for (String liker : Arrays.copyOfRange(lineData, 1, lineData.length))
            likers.add(liker.trim());

        processLikesFor(user, likers);
        processLikesBy(user, likers);
    }

    private void processLikesFor(String user, List<String> likers) {
        likesFor.computeIfAbsent(user, k -> new ArrayList<String>());
        likesFor.get(user).addAll(likers);
    }

    private void processLikesBy(String user, List<String> likers) {
        for (String liker : likers) {
            likesBy.computeIfAbsent(liker, k -> new ArrayList<String>());
            likesBy.get(liker).add(user);
        }
    }
}
