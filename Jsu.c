#include <stdio.h>
struct jsu
{
    char nae[12];
    int os, db, hab, hhab;
};

int main() 
{
    struct jsu st[3] = { {"데이터 1" , 95 , 88},{"데이터 2" , 84 , 91}, {"데이터 3", 86 , 75}};
    struct jsu* p;
    p = &st[0];
    (p + 1)->hab = (p+1)->os + (p+2)-> db;
    (p + 1)->hhab = (p+1)->hab + p->os + p->db;
    printf("%d" , (p+1)->hab + (p+1)->hhab);
    
}

// 실행키는 컨 + 쉬 + r