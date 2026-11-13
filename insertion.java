
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode=new TreeNode(val);
        if(root==null){
            return newNode;
        }
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode curr=queue.poll();
            if(curr.left==null){
                curr.left=newNode;
                return root;
            }
            else{
                queue.offer(curr.left);
            }
            if(curr.right==null){
                curr.right=newNode;
                return root;
            }
            else{
                queue.offer(curr.right);
            }
            }
            return root;
        }
    }
