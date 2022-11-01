package ladder.view;

import java.util.Scanner;

public class InputView {
    public static final String INPUT_PARTICIPATE_PEOPLE_MESSAGE = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    public static final String HOW_MANY_COUNT_MAX_LADDER_HEIGHT_MESSAGE = "최대 사다리 높이는 몇 개인가요?";
    private static final Scanner SCANNER = new Scanner(System.in);

    private InputView() {
    }

    public static String askParticipatedPeople() {
        System.out.println(INPUT_PARTICIPATE_PEOPLE_MESSAGE);
        return SCANNER.nextLine();
    }

    public static int askMaxLadderHeight() {
        System.out.println(HOW_MANY_COUNT_MAX_LADDER_HEIGHT_MESSAGE);
        return SCANNER.nextInt();
    }
}