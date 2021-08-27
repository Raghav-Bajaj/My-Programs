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
    public static TreeNode build(int[] preorder, int pstart , int pend , int[] inorder , int istart , int iend)
    {
        if(pend < pstart) return null ;
        
        int count = istart ;
        while(inorder[count] != preorder[pstart])
            count++;
            int tc = count - istart ;
        TreeNode node  = new TreeNode(preorder[pstart]);
        node.left = build(preorder,pstart+1 , pstart+tc ,inorder, istart , count -1);
        node.right = build(preorder , pstart+tc+1 , pend ,inorder, count+1, iend);
        return node ;
        
    }
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length ;
        
        return build(preorder , 0 , n-1 , inorder , 0 , n-1);
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
        int[] pre = new int[n];
        for (int i = 0; i < n; i++)
            pre[i] = scn.nextInt();

        int[] in = new int[n];
        for (int i = 0; i < n; i++)
            in[i] = scn.nextInt();

        TreeNode root = buildTree(pre, in);
        display(root);
    }

    public static void main(String[] args) {
        solve();
    }
}
