#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>

float A, B, C;
float cuboLargura = 20;
int largura = 160, altura = 44;
float zBuffer[160 * 44];
char buffer[160 * 44];
int backgroundASCIICode = ' ';
int distanceFromCam = 100;
float horizontalOffset;
float K1 = 40;

float incrementSpeed = 0.6;

float x, y, z;
float ooz;
int xp, yp;
int idx;

float calculoX(int i, int j, int k){
    return j * sin(A) * sin(B) * cos(C) - k * cos(A) + sin(B) * cos(C) +
    j * cos(A) * sin(C) + k * sin(A) * sin(C) + i * cos(B) * cos(C);
}

float calculoY(int i, int j, int k) {
    return j * cos(A) * cos(C) + k * sin(A) * cos(C) -
    j * sin(A) * sin(B) * sin(C) + k * cos(A) * sin(B) * sin(C) -
    j * cos(B) * sin(C);
}

float calculoZ(int i, int j, int k){
    return k * cos(A) * cos(B) - j * sin(A) * cos(B) + i * sin(B);
}

void calculodaSuperficie(float cuboX, float cuboY, float cuboZ, int ch){
    x = calculoX(cuboX, cuboY, cuboZ);
    y = calculoY(cuboX, cuboY, cuboZ);
    z = calculoZ(cuboX, cuboY, cuboZ) + distanceFromCam;

    ooz = 1/z;

    xp = (int)(largura/2 + horizontalOffset + K1 * ooz * x * 2);
    yp = (int)(altura/2 + K1 * ooz * y);

    idx = xp + yp * largura;
    if(idx >= 0 && ids < largura * altura){
        if(ooz> zBuffer[idx]) {
            zBuffer[idx] = ooz;
            buffer[idx] = ch;
        }
    }
}

int main(){
    printf("\x1b[2J");
    while (1) {
        memset(buffer, backgroundASCIICode, largura * altura);
        memset(zBuffer, 0, largura * altura * 4);
        cuboLargura = 20;
        horizontalOffset = -2 * cuboLargura;
        for(float cuboX= - cuboLargura; cuboX < cuboLargura; cuboX += incrementSpeed) {
            for(float cuboY = - cuboLargura; cuboY < cuboLargura; cuboY += incrementSpeed) 
            calculodaSuperficie(cuboX, cuboY, -cuboLargura, '.');
            calculodaSuperficie(cuboLargura, cuboY, cuboX, '#');
            calculodaSuperficie(-cuboLargura, cuboY, -cuboX, '$');
            calculodaSuperficie(-cuboX, cuboY, cuboLargura, '^');
            calculodaSuperficie(cuboX, -cuboLargura, -cuboY, ';');
            calculodaSuperficie(cuboX, cuboLargura, cuboY, '&');
        }
    }
    cuboLargura = 10;
    horizontalOffset = 1 * cuboLargura;
    for (float cuboX = -cuboLargura; cuboX < cuboLargura; cuboX += incrementSpeed) {
      for (float cuboY = -cuboLargura; cuboY < cuboLargura;
           cuboY += incrementSpeed) {
        calculodaSuperficie(cuboX, cuboY, -cuboLargura, '.');
        calculodaSuperficie(cuboLargura, cuboY, cuboX, '#');
        calculodaSuperficie(-cuboLargura, cuboY, -cuboX, '$');
        calculodaSuperficie(-cuboX, cuboY, cuboLargura, '^');
        calculodaSuperficie(cuboX, -cuboLargura, -cuboY, ';');
        calculodaSuperficie(cuboX, cuboLargura, cuboY, '&');
      }
    }
    cuboLargura = 5;
    horizontalOffset = 8 * cuboLargura;
    for (float cuboX = -cuboLargura; cuboX < cuboLargura; cuboX += incrementSpeed) {
      for (float cuboY = -cuboLargura; cuboY < cuboLargura;
           cuboY += incrementSpeed) {
        calculodaSuperficie(cuboX, cuboY, -cuboLargura, '.');
        calculodaSuperficie(cuboLargura, cuboY, cuboX, '#');
        calculodaSuperficie(-cuboLargura, cuboY, -cuboX, '$');
        calculodaSuperficie(-cuboX, cuboY, cuboLargura, '^');
        calculodaSuperficie(cuboX, -cuboLargura, -cuboY, ';');
        calculodaSuperficie(cuboX, cuboLargura, cuboY, '&');
      }
    }
    printf("\x1b[H")
    for (int k = 0; k < largura * altura; k++){
        putchar(k % largura ? buffer[k] : 10);
    }

    A += 0.05;
    B += 0.05;
    C += 0.01;
    usleep(8000 * 2);
}
return 0;{
}
