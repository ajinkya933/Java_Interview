public class stack_example {
    private int[] arr;
    private int top=0;
    public stack_example(int StackSize){
        this.arr=new int[StackSize];

    }

    public static void main(String[] args){
        stack_example st =new stack_example(3);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.print(st.pop());
        System.out.print(st.pop());



    }
    private int pop(){
        if(top>0){
            return arr[--top];
        }
        else{
            throw new java.util.NoSuchElementException();
        }
    }


    private void push(int i){
        if(top<arr.length){
            arr[top++]=i;
            System.out.println("pushed"+i);
        }
        else {

            System.out.print("stack is full");
        }

    }


}
