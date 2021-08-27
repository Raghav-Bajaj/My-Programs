import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length ;
        return build(inorder, 0 , n-1 , postorder , 0 , n-1);
    }
     public static TreeNode build(int[] inorder ,int s , int e, int[] postorder , int ps , int pe) {
         if(e < s)
         return null;
       
        int count = s ;
        while(inorder[count] != postorder[pe])
             count++;
        int t = count - s ;
         TreeNode node = new TreeNode(postorder[pe]);
        node.left = build(inorder ,s ,count -1 ,postorder,ps , ps + t -1 );
        node.right = build(inorder,count+1,e,postorder,ps+t , pe -1);
        return node ;
    }
    // input_section=================================================

    public static void display(TreeNode node) {
        if (node == null)
            return;

        StringBuilder sb = new StringBuilder();
        sb.append((node.left != null ? node.left.val : "."));
        sb.append(" -> " + node.val + " <- ");
        sb.append((node.right != null ? node.right.val : "."));

        System.out.println(sb.toString());

        display(node.left);
        display(node.right);

    }

    public static void solve() {
        int n = scn.nextInt();
        int[] post = new int[n];
        for (int i = 0; i < n; i++)
            post[i] = scn.nextInt();

        int[] in = new int[n];
        for (int i = 0; i < n; i++)
            in[i] = scn.nextInt();

        TreeNode root = buildTree(in, post);
        display(root);
    }

    public static void main(String[] args) {
        solve();
    }
}
