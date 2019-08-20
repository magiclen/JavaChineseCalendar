import org.junit.Test;

import org.magiclen.農曆.農曆;

public class 農曆測試 {
    @Test
    public void 自動化自我測試() throws Exception {
        農曆 農曆一, 農曆二; //A用西曆建立農曆，B用農曆建立西曆
        for (int 年 = 1901; 年 <= 農曆.最大西曆年; ++年) {
            for (int 月 = 1; 月 <= 12; ++月) {
                for (int 日 = 1; 日 <= 31; ++日) {
                    //西曆建立農曆
                    農曆一 = 農曆.建立(年, 月, 日);
                    if (農曆一 == null) {
                        //沒有這個西曆日期
                        continue;
                    }
                    //用A轉換出的農曆套給B
                    農曆二 = 農曆.建立(農曆一.取得農曆年(), 農曆一.取得農曆月(), 農曆一.是否為閏月(), 農曆一.取得農曆日()); //B用農曆建立西曆
                    if (農曆二 == null) {
                        throw new Exception(String.format("-----%n此筆資料無法建立出農曆%n%s%n-----%n", 農曆一));
                    }

                    if (!農曆一.equals(農曆二)) { //西曆和農曆互轉必須為相同的結果，所以若A、B不同，表示計算結果有誤。
                        throw new Exception(String.format("-----%n資料不相等農曆%nA%n%s%n-%nB%n%s%n-----%n", 農曆一, 農曆二));
                    }
                }
            }
        }
    }
}