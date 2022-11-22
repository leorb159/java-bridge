package bridge;

import java.util.List;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printMap(List<List<String>> dashboard, int count) {
        for(int i=0; i<dashboard.size(); i++) {
            System.out.print("[ ");
            for(int j=0; j<count-1; j++){
                System.out.print(dashboard.get(i).get(j)+" | ");
            }
            System.out.print(dashboard.get(i).get(count-1));
            System.out.println(" ]");
        }
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printResult(BridgeGame bridgeGame) {
        System.out.println("최종 게임 결과");
        printMap(bridgeGame.getDashBoard(), bridgeGame.getCount());
        System.out.println();
        System.out.print("게임 성공 여부: ");
        System.out.println(printIsGameClear(bridgeGame.getIsWin()));
        System.out.println("총 시도한 횟수: "+bridgeGame.getNumberOfTimes());
    }
    public String printIsGameClear(boolean isClear){
        if(isClear){
            return "성공";
        }
        return "실패";
    }
    //게임시작 메시지 출력
    public void printGameStart(){
        System.out.println("다리 건너기 게임을 시작합니다.");
        System.out.println();
    }
}
