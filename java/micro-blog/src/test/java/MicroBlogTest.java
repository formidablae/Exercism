import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class MicroBlogTest {

    private final MicroBlog microBlog = new MicroBlog();
    
    @Test
    public void englishLanguageShort() {
        String expected = "Hi";
        assertEquals(expected, microBlog.truncate("Hi"));
    }

    @Test
    public void englishLanguageLong() {
        String expected = "Hello";
        assertEquals(expected, microBlog.truncate("Hello there"));
    }
    
    @Test
    public void germanLanguageShort_broth() {
        String expected = "brühe";
        assertEquals(expected, microBlog.truncate("brühe"));
    }

    @Test
    public void germanLanguageLong_bearCarpet_to_beards() {
        String expected = "Bärte";
        assertEquals(expected, microBlog.truncate("Bärteppich"));
    }
    
    @Test
    public void bulgarianLanguageShort_good() {
        String expected = "Добър";
        assertEquals(expected, microBlog.truncate("Добър"));
    }

    @Test
    public void greekLanguageShort_health() {
        String expected = "υγειά";
        assertEquals(expected, microBlog.truncate("υγειά"));
    }
    
    @Test
    public void mathsShort() {
        String expected = "a=πr²";
        assertEquals(expected, microBlog.truncate("a=πr²"));
    }

    @Test
    public void mathsLong() {
        String expected = "∅⊊ℕ⊊ℤ";
        assertEquals(expected, microBlog.truncate("∅⊊ℕ⊊ℤ⊊ℚ⊊ℝ⊊ℂ"));
    }
    
    @Test
    public void englishAndEmojiShort() {
        String expected = "Fly 🛫";
        assertEquals(expected, microBlog.truncate("Fly 🛫"));
    }
    
    @Test
    public void emojiShort() {
        String expected = "💇";
        assertEquals(expected, microBlog.truncate("💇"));
    }
    
    @Test
    public void emojiLong() {
        String expected = "❄🌡🤧🤒🏥";
        assertEquals(expected, microBlog.truncate("❄🌡🤧🤒🏥🕰😀"));
    }
    
    @Test
    public void royalFlush() {
        String expected = "🃎🂸🃅🃋🃍";
        assertEquals(expected, microBlog.truncate("🃎🂸🃅🃋🃍🃁🃊"));
    }
}
