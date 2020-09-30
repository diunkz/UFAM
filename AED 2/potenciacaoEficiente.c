#include <stdio.h>

int potenciaRecursiva(int numero, int expoente)
{
    if (expoente == 0)
    {
        return 1;
    }
    else if (expoente % 2 == 0)
    {
        return potenciaRecursiva(numero, expoente / 2) * potenciaRecursiva(numero, expoente / 2);
    }
    else
    {
        return numero * potenciaRecursiva(numero, expoente - 1);
    }
}

int main()
{
    int num = 0, exp = 0;

    while (scanf("%d %d", &num, &exp) != EOF)
    {
        printf("%d\n", potenciaRecursiva(num, exp));
    }

    return 0;
}
