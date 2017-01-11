/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Minnnnn
 *
 * Created on January 19, 2016, 11:16 AM
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/*
 * 
 */
int str_cmp(char s1[], char s2[])
{
    int i,j,n;
    i=0;
    j=0;
    
    n= strlen(s2);
    while (1){
        if (s1[i]==s2[j]) {
            i++;
            j++;
        }
        if (s1[i]>s2[j]) return 1;
        if (s1[i]<s2[j]) return -1;
        if (i==j && j== strlen(s2) && i== strlen(s1)) return 0;
    }
}
char* str_str(char s1[],char s2[]){
    int i=0,p,j=0;
    char *str = s1;
    int k;
    while(s1[i] !='\0'){
        p = i;
        while(s1[p] == s2[j] && s2[j] !='\0'){
            p++;
            j++;
        }
        if (s2[j] =='\0' && j == strlen(s2)){
            
            for (k=0; k <= i; k++){
                str++;
            } 
            return str;
        }
        
    }
    return NULL;
}

int main(int argc, char** argv) {
    char s1[10]= "abcxde";
    char s2[10]= "b";
//    gets(s1);
//    gets(s2);
//    int n = str_cmp(s1,s2);
//    printf("%d \n",n);
//    printf("%s \n",strstr(s1,s2));
//    printf("%s ",str_str(s1,s2));
    printf("%s ",strstr(s1,s2));
    return (EXIT_SUCCESS);
}

