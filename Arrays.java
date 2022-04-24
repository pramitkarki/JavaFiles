class Arrays{
public static void main(String[] args){
int c[];
int a[] = new int[3];
a[0] = 1;
a[1] = 2;
a[2] = 3;
System.out.println("1D-Array type 1");
for(int i = 0; i<3; i++)
System.out.println(a[i]);

System.out.println("1D-Array type 2");
int b[] = {1,2,3,4,5,6,7};
for(int i=0; i<b.length;i++)
System.out.println(b[i]);

System.out.println("1D-Array type 3");
c = new int[5];
for(int i=0;i < c.length; i++)
System.out.println(c[i]);

System.out.println("2D-Array Sum");
int matrixa[][]=new int[3][3];
for(int i=0;i<3;i++)
for(int j=0;j<3;j++)
{
matrixa[i][j]=i+j;
System.out.println(matrixa[i][j]);
}


System.out.println("2D-Array Prod");
int matrixb[][]=new int[3][4];
for(int i=0;i<matrixb.length;i++)
for(int j=0;j<matrixb[i].length;j++)
{
matrixb[i][j]=i*j;
System.out.println(matrixb[i][j]);
}


/*for(int i = 0; i<3; i++)
System.out.println(a[i]);
replace this for-loop into for-each loop*/
System.out.println("for-each 1D Array");
for(int i:a)
System.out.println(i);

/*int matrixa[][]=new int[3][3];
for(int i=0;i<3;i++)
for(int j=0;j<3;j++)
{
matrixa[i][j]=i+j;
System.out.println(matrixa[i][j]);
}
replace with for-each loop*/
System.out.println("for-each 2D Array");
for(int i[]:matrixa)
for(int j:i)
System.out.println(j);


/*int matrixb[][]=new int[3][4];
for(int i=0;i<matrixb.length;i++)
for(int j=0;j<matrixb[i].length;j++)
{
matrixb[i][j]=i*j;
System.out.println(matrixb[i][j]);
}
replace with for-each loop */
System.out.println("for-each 2D Array 2");
for(int i[]:matrixb)
for(int j:i)
System.out.println(j);



}
}