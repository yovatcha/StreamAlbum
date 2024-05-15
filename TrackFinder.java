import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TrackFinder {

    // Original code
    public Set<String> findLongTracks(List<Album> albums) {
        Set<String> trackNames = new HashSet<>();
        for (Album album : albums) {
            for (Track track : album.getTrackList()) {
                if (track.getLength() > 60) {
                    String name = track.getName();
                    trackNames.add(name);
                }
            }
        }
        return trackNames;
    }

    // Refactored code
    public Set<String> findLongTracksRefactored(List<Album> albums) {
        Set<String> trackNameRef = albums.stream()
                .flatMap(album -> album.getTrackList().stream())
                .filter(track -> track.getLength() > 60)
                .map(Track::getName)
                .collect(Collectors.toSet());
        return trackNameRef;
    }

    public static void main(String[] args) {

        List<Album> albums = SampleData.albums.collect(Collectors.toList());

        TrackFinder trackFinder = new TrackFinder();

        // Original code execution
        Set<String> longTracks = trackFinder.findLongTracks(albums);
        System.out.println("Original: " + longTracks);

        // Refactored code execution
        Set<String> longTracksRef = trackFinder.findLongTracksRefactored(albums);
        System.out.println("Refactored: " + longTracksRef);
    }
}
