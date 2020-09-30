#include <stdio.h>

int somarVetorRecursivamente(int *vetor, int tamanho)
{
    if (tamanho == 1)
        return vetor[0];
    else
        return vetor[tamanho - 1] + somarVetorRecursivamente(vetor, tamanho - 1);
}

int inverterVetorRecursivamente(int vetor[], int comeco, int tamanho)
{
    int aux = vetor[comeco];

    if (comeco < tamanho)
    {
        vetor[comeco] = vetor[tamanho];
        vetor[tamanho] = aux;

        inverterVetor(vetor, comeco + 1, tamanho - 1);
    }
}

int main()
{
    int tamanho;
    int vetor[20];

    scanf("%d", &tamanho);

    for (int i = 0; i < tamanho; i++)
    {
        scanf("%d", &vetor[i]);
    }

    inverterVetorRecursivamente(vetor, 0, tamanho - 1);

    for (int i = 0; i < tamanho; i++)
    {
        printf("%d ", vetor[i]);
    }

    printf("%d\n", somarVetorRecursivamente(vetor, tamanho));
}