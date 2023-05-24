package nextstep.ladder.domain.line;

import nextstep.ladder.domain.user.User;

import java.util.*;
import java.util.stream.Stream;

public class LadderResult {

    private final Map<User, Integer> result = new HashMap<>();

    public void put(User key, Integer value) {
        result.put(key, value);
    }

    public Integer get(User key) {
        return result.get(key);
    }

    public Stream<User> keyStream() {
        return result.keySet().stream();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LadderResult that = (LadderResult) o;
        return Objects.equals(result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }
}
