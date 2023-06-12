package nextstep.ladder.domain.line;

import nextstep.ladder.domain.user.Users;

public class LadderGame {

    private final Ladder ladder;
    private final Users users;
    private final LadderResult ladderResult;

    public LadderGame(Ladder ladder, Users users) {
        this.ladder = ladder;
        this.users = users;
        this.ladderResult = new LadderResult();
    }

    public LadderResult start() {
        for (int index = 0; index < users.userCount(); index++) {
            ladderResult.put(users.findUser(index), ladder.move(index));
        }
        return ladderResult;
    }

}
