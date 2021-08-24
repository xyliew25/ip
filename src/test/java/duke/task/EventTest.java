package duke.task;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EventTest {

  @Test
  void toStringData() {
    Event event = new Event("go party", "tonight");
    assertEquals("E | 0 | go party | tonight", event.toStringData());
    event.markAsDone();
    assertEquals("E | 1 | go party | tonight", event.toStringData());
  }

  @Test
  void testToString() {
    Event event = new Event("go party", "tonight");
    assertEquals("[E][ ] go party (at: tonight)", event.toString());
    event.markAsDone();
    assertEquals("[E][X] go party (at: tonight)", event.toString());
  }
}