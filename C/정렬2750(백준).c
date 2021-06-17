#include <stdio.h>
// 2750번 선택정렬(첫 min은 모든 정렬보다 커야됨)
int array[1001];

int main(void)
{
    int number, i, j, temp, min, index;
    // 첫번째줄 = 개수 입력 받기
    scanf("%d", &number);
    for (i = 0; i < number; i++)
    {
        // 두번째 줄부터 각 array 수 입력받기
        scanf("%d", &array[i]);
    }
    //정렬시작`
    for (i = 0; i < number; i++)
    {
        min = 1001;
        for (j = i; j < number; j++)
        {
            if (min > array[j])
            {
                min = array[j];
                index = j;
            }
        }
        temp = array[i];
        array[i] = array[index];
        array[index] = temp;
    }
    for (i = 0; i < number; i++)
    {
        printf("%d\n", array[i]);
    }
}
