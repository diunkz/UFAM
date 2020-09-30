#include <stdio.h>
#include <stdlib.h>

typedef struct no
{
    int valor;
    struct no *anterior;
    struct no *proximo;
} No;

typedef struct fila
{
    No *inicio;
    No *fim;
} Fila;

No *CriaNo(int val)
{
    No *p = calloc(1, sizeof(No));
    p->valor = val;

    return p;
}

Fila *CriaFila()
{
    Fila *f = (Fila *)calloc(1, sizeof(Fila));
    //calloc já seta tudo com 0:
    f->inicio = NULL;
    f->fim = NULL;

    return f;
}

int VerificarSeEstaVazia(Fila *f)
{
    return (f->inicio == NULL);
}

void InsereNaFila(Fila *f, int val)
{
    No *p = CriaNo(val);

    //caso 1: a fila está vazia
    if (VerificarSeEstaVazia(f))
    {
        f->inicio = p;
        f->fim = p;
    }
    // a fila possui elementos
    else
    {
        f->fim->anterior = p;
        p->proximo = f->fim;
        f->fim = p;
    }
}

void RemoverNaFila(Fila *f)
{
    if (!VerificarSeEstaVazia(f))
    {
        if (f->inicio != f->fim)
        {
            f->inicio = f->inicio->anterior;
            free(f->inicio->proximo);
            f->inicio->proximo = NULL;
        }
        else
        {
            f->fim = NULL;
            free(f->inicio);
            f->inicio = NULL;
        }
    }
}

void MostrarFila(Fila *f)
{
    No *p = f->inicio;

    printf("L -> ");
    while (p != NULL)
    {
        printf("%d -> ", p->valor);
        p = p->anterior;
    }

    printf("NULL\n");
}

int main()
{
    Fila *testeFila = CriaFila();

    int q, entrada, contador = 0;
    char c = 0;

    scanf("%d", &q);

    while (c != '\n')
    {
        scanf("%d%c", &entrada, &c);
        InsereNaFila(testeFila, entrada);
    }

    while (!VerificarSeEstaVazia(testeFila))
    {
        if (testeFila->inicio->valor > q)
        {
            InsereNaFila(testeFila, testeFila->inicio->valor - q);
        }

        if (testeFila->inicio == testeFila->fim)
        {
            contador += testeFila->inicio->valor;
        }
        else
        {
            contador += q;
        }

        RemoverNaFila(testeFila);
    }
    printf("%d", contador);

    return 0;
}
