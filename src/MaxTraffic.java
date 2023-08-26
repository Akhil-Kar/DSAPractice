import java.util.Arrays;
import java.util.Comparator;

public class MaxTraffic {
    public static void main(String[] args) {
        int[] start = {1, 6, 2, 9};
        int[] end = {8, 7, 6, 10};

        // Create an array of events
        Event[] events = new Event[start.length * 2];
        for (int i = 0; i < start.length; i++) {
            events[i * 2] = new Event(start[i], EventType.START);
            events[i * 2 + 1] = new Event(end[i], EventType.END);
        }

        // Sort events array
        Arrays.sort(events, Comparator.comparingInt(event -> event.time));

        int maxInteractions = 0;
        int activeInteractions = 0;

        // Iterate through sorted events
        for (Event event : events) {
            if (event.type == EventType.START) {
                activeInteractions++;
                maxInteractions = Math.max(maxInteractions, activeInteractions);
            } else {
                activeInteractions--;
            }
        }

        System.out.println("Maximum interactions: " + maxInteractions);
    }
}

class Event {
    int time;
    EventType type;

    Event(int time, EventType type) {
        this.time = time;
        this.type = type;
    }
}

enum EventType {
    START,
    END
}