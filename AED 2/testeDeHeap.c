#include <stdio.h>
#define PAI(i) (i / 2)
#define ESQ(i) (i * 2 + 1)
#define DIR(i) (i * 2 + 2)

int verificarHeapMax(int *vet, int pai, int tam)
{
    int maior = pai;

    if (ESQ(pai) < tam && vet[ESQ(pai)] > vet[pai])
    {
        maior = ESQ(pai);
    }

    if (DIR(pai) < tam && vet[DIR(pai)] > vet[maior])
    {
        maior = DIR(pai);
    }

    if (maior != pai)
    {
        return 0;
    }

    return 1;
}

int main()
{
    int tamanho = 0, pos = 0, verificacao = 1;
    int vetor[101];

    while (scanf("%d", &tamanho) != EOF)
    {
        for (int i = 0; i < tamanho; i++)
        {
            scanf("%d", &vetor[i]);
        }

        verificacao = 1;
        pos = (tamanho / 2) - 1;

        while (pos >= 0)
        {
            if (!verificarHeapMax(vetor, pos, tamanho))
            {
                verificacao = 0;
                pos = -1;
            }
            else
            {
                pos--;
            }
        }

        if (!verificacao)
        {
            printf("NAO\n");
        }
        else
        {
            printf("SIM\n");
        }
    }

    return 0;
}
