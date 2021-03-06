package vocabulary.core;

import java.util.List;

public interface Vocabulary {
	List<String> translate(String word);
	List<String> describe(String word);
	List<String> synonims(String word);
}
