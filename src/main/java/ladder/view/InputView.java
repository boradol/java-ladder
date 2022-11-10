package ladder.view;

import java.util.List;
import java.util.Scanner;

import static ladder.util.LadderMembersExpression.validateMemberNames;
import static ladder.util.LadderResultExpression.validateLadderResult;

public class InputView {
    private static final String INPUT_PARTICIPATE_PEOPLE_MESSAGE = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    private static final String INPUT_EXECUTE_RESULT_MESSAGE = "실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요.)";
    private static final String HOW_MANY_COUNT_MAX_LADDER_HEIGHT_MESSAGE = "최대 사다리 높이는 몇 개인가요?";
    private static final String WHOSE_RESULT_MESSAGE = System.lineSeparator() + "결과를 보고 싶은 사람은?";
    private static final Scanner SCANNER = new Scanner(System.in);

    private InputView() {
    }

    public static List<String> askParticipatedPeople() {
        System.out.println(INPUT_PARTICIPATE_PEOPLE_MESSAGE);
        return validateMemberNames(SCANNER.nextLine());
    }

    public static List<String> askLadderResult() {
        System.out.println(INPUT_EXECUTE_RESULT_MESSAGE);
        return validateLadderResult(SCANNER.nextLine());
    }

    public static String askMaxLadderHeight() {
        System.out.println(HOW_MANY_COUNT_MAX_LADDER_HEIGHT_MESSAGE);
        return SCANNER.nextLine();
    }

    public static String askResultMember() {
        System.out.println(WHOSE_RESULT_MESSAGE);
        return SCANNER.nextLine();
    }
}
