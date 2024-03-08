#include <stdio.h>
#define MAXK ((int)5e3)

typedef struct 
{
    int x;
    int y;
    int cnt;
}Queue;

Queue q[100000];
int wp = 0;
int rp = 0;
Queue popleft(){
    return q[rp++];
}

void append(int x, int y, int cnt){
    q[wp].x = x;
    q[wp].y = y;
    q[wp++].cnt = cnt;
}

int isEmpty(){
    return wp == rp;
}

int M, N;//가로크기, 세로크기
int K;//버스수
int ID[MAXK + 10];
int X1[MAXK + 10];
int Y1[MAXK + 10];
int X2[MAXK + 10];
int Y2[MAXK + 10];
int SX, SY, DX, DY;//출발 도착 좌표(가로, 세로)

int visited_bus[MAXK + 10] = {0, }; 

int isPossible(int x, int y, int idx){
    // x, y 좌표에서 탈 수 있는 버스(idx) 인지?
    // x가 같은 버스 인지
    if(X1[idx] == X2[idx] == x){
        if(Y1[idx] <= y && y <= Y2[idx]) {
            return 1;
        } else{
            return 0;
        }
    } else if(Y1[idx] == Y2[idx] == y) {
        // y가 같은 버스
        if(X1[idx] <= x && x <= X2[idx]) {
            return 1;
        } else {
            return 0;
        }
    }

}

void InputData(void) {
	scanf("%d %d", &M, &N);
	scanf("%d", &K);
	for (int i = 0; i < K; i++) {
		scanf("%d %d %d %d %d", &ID[i], &X1[i], &Y1[i], &X2[i], &Y2[i]);
	}
	scanf("%d %d %d %d", &SX, &SY, &DX, &DY);
}
int main(void) {
	int ans = 0;
	InputData();//입력
	
	//여기서부터 작성

    // 1. 시작점을 큐에 넣고 시작점에서 탈 수 있는 버스를 다 찾고,
    // 2. 내릴 수 있는 지점에 대해 다 큐를 넣은 다음, 그 해당 버스는 visited 처리
    // 3. 큐에는 x, y, cnt 값을 넣어 진행
    append(1,1,0);
    // 시작점
    while(!isEmpty){
        Queue now = popleft();
        int x = now.x; 
        int y = now.y;
        int cnt = now.cnt;

        // 갈 수 있는 곳 확인
        for(int i=0; i<K; i++){
            // 모든 버스에 대해
            if(visited_bus[i]) continue;
            if(isPossible(x, y, i)) {
                // 탈 수 있는 버스라면
                
                if(X1[i] == X2[i]) {
                    // x가 같은 버스
                    for(int j=Y1[i]; j<=Y2[i]; j++){
                        
                    }
                }
                if(Y1[i] == Y2[i]) {
                    // y가 같은 버스
                }
                
            }
        }
    }

	printf("%d\n", ans);//출력
	return 0;
}