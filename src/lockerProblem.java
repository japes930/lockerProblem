public class lockerProblem{
    public static void main(String[] args){

        int locker[] = new int[100];
        for (int a=0; a<locker.length; a++){
            locker[a] = 1;
        }
        for (int b = 1; b<locker.length; b=b+2){
            if(locker[b]==1){
                locker[b]=0;
            }
        }
        for (int c=2; c<locker.length; c=c+3){
            switch(locker[c]){
                case 1:
                    locker[c]=0;
                    break;
                case 0:
                    locker[c]=1;
                    break;
            }
        }

        for (int n=0; n<100; n++){
            for(int x=n; x<100; x+=n){
                switch(locker[x]){
                    case 1:
                        locker[x]=0;
                        break;
                    case 0:
                        locker[x]=1;
                        break;
                }

            }
            for (int z = 0; z<100; z++){
                if (locker[z]==1){
                    System.out.println("Open Locker: " + z);

                }
            }
        }


    }

}
