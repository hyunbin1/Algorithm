import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.ArrayList;
import javax.sound.sampled.SourceDataLine;

/* 
한 개의 회의실이 있는데 이를 사용하고자 하는 N개의 회의에 대하여 회의실 사용표를 만들려고 한다. 
각 회의 I에 대해 시작시간과 끝나는 시간이 주어져 있고, 각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는 회의의 최대 개수를 찾아보자. 
단, 회의는 한번 시작하면 중간에 중단될 수 없으며 한 회의가 끝나는 것과 동시에 다음 회의가 시작될 수 있다. 
회의의 시작시간과 끝나는 시간이 같을 수도 있다. 
이 경우에는 시작하자마자 끝나는 것으로 생각하면 된다.
*/


/* 로직 순서
1. 인풋 받기
2. 이차원 배열에 시작, 끝 넣기
3. 끝나는 시간 기준으로 빠른 순으로 선택하기
for(i~n){
    end = 
    count += 1;
}
4. 한 회의가 끝나면 그 전의 시간은 시작 회의에서 생각하지 않기 



*/

class Meeting implements Comparable<Meeting>{
    int start;
    int end;

    public Meeting(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Meeting room){
        if(this.end == room.end){
            return this.start - room.start;
        }
        return this.end - room.end;
    }
}


public class Number1931 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine()); // 회의 개수(=첫 줄 입력)
        Meeting[] room= new Meeting[N]; // 1: 시작, 2. 종료 시간
        
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            room[i] = new Meeting(start, end);
        }
        Arrays.sort(room);

        
        int endPoint = room[0].end;
        int count = 1; // 처음 회의는 정해지고 그 다음 회의와 첫 회의를 비교하느 것이기 때문에 count 1을 해준다. 

        for(int i=1; i<N; i++){
            if(endPoint <= room[i].start){ // 이전 회의 끝나는 시간보다 회의 시작이 이후여야 된다.
                count++;
                endPoint = room[i].end;
            }
        }
        System.out.println(count);
    }
}
