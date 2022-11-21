package bridge;

import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        System.out.println("다리의 길이를 입력해주세요.");
        String input = Console.readLine();

        if(!isNumber(input)){
            throw  new IllegalArgumentException("[ERROR] 숫자만 입력해주세요.");
        }
        return Integer.parseInt(input);
    }
    // 다리길이 입력이 숫자인지 예외처리
    private static boolean isNumber(String input){
        try {
            Integer.parseInt(input);
        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        System.out.println("이동할 칸을 선택해주세요. (위: U, 아래: D)");
        String input = Console.readLine();
        if(!isUpDown(input)){
            throw  new IllegalArgumentException("[ERROR] 이동할 칸은 U 또는 D로만 입력가능 합니다");
        }
        return input;
    }

    // 이동할 칸 입력이 U 또는 D인지 예외처리
    private static boolean isUpDown(String input){
        if(!input.equals("U") || !input.equals("D")){
            return false;
        }
        return true;
    }
    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        System.out.println("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)");
        String input = Console.readLine();
        return input;
    }

    // 게임 재시도 여부 입력이 R 또는 Q인지 예외처리
    private static boolean isRestartQuit(String input){
        if(!input.equals("R") || !input.equals("Q")){
            return false;
        }
        return true;
    }
}
