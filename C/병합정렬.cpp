#include <stdio.h>
// �ϴ� ������ �ɰ��� ���߿� ��ģ��.
// �ð����⵵�� NlogN�� �������ش�

int number = 8; // ������ ����
int sorted[8];	// ���������� ������ �迭�� �������ش�. �̴� �迭 ��Ҹ� �� ������ �����ص����ν� ��ȿ������ �޸� �߰� ������ ����

void merge(int a[], int m, int middle, int n) // m~n: ������ �߰��� ����
{
	int i = m;
	int j = middle + 1; // i �� k���̸� ����������� �� ���� �������� ����.
	int k = m;
	// ���� ������� �迭�� ����
	while (i <= middle && j <= n)
	{
		if (a[i] <= a[j])
		{ // ���� �迭 i�� j�迭 ���� �۴ٸ� ���ʿ� i�� �־��ָ� �ȴ�.
			sorted[k] = a[i];
			i++;
			else()
		}
	}
}
