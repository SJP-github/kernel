package com.sjp.tree;

/**
 * @Author: sjp
 * @Date : Created in 2020/7/10
 * @Description:二分查找树
 */

public class BinarySearchTre {

    private Node tree;

    /**
     * 二叉查找树查找思路
     * 如果要查找的数据比当前节点小就遍历查找它的左子树；
     * 如果要查找的数据比当前节点打就遍历查找它的右子树；
     *
     * @param data
     * @return
     */
    public Node find(int data) {
        //tree节点表示根节点，从根节点开始遍历
        Node p = tree;
        while (p != null) {
            if (data < p.data) {
                p = p.left;
            } else if (data > p.data) {
                p = p.right;
            } else {
                return p;
            }
        }
        return null;
    }

    /**
     * 二叉树插入与查找类似
     * 如果数据比当前节点大且他的右节点为空直接将数据插到右子节点位置；
     * 如果右子节点不为空则遍历右子树查找插入位置
     *
     * @param data
     */
    public void insert(int data) {
        //1.根节点为空，直接插入根节点
        if (tree == null) {
            tree = new Node(data);
            return;
        }
        //2.根节点不为空
        Node p = tree;
        while (p != null) {
            if (data > p.data) {
                if (p.right == null) {
                    p.right = new Node(data);
                    return;
                }
                p = p.right;
            } else {
                if (p.left == null) {
                    p.left = new Node(data);
                    return;
                }
                p = p.left;
            }
        }
    }


    /**
     * 二叉树删除
     * 分三种情况：
     * 1.要删除的节点没有子节点；将它父节点指向待删除节点的指针置为null
     * 2.要删除的节点有一个子节点；更新父节点中指向要删除节点的指针，让它指向要删除节点的子节点
     * 3.要删除的节点有两个子节点；需要找到待删除节点右子树中的最小节点，把他替换到要删除的节点上，并把原位置的最小节点删掉
     *
     * @param data
     */
    public void delete(int data) {
        //target要删除的目标节点,初始化指向根节点
        Node target = tree;
        //要删除节点的父节点
        Node parent = null;

        //遍历二叉数查找待删除节点的位置
        while (target != null && target.data != data) {
            parent = target;
            if (data > target.data) {
                target = target.right;
            } else {
                target = target.left;
            }
        }
        if (target == null) {
            return;//没有找到要删除的节点
        }

        //如果要删除的节点有两个子节点
        if (target.left != null && target.right != null) {
            //查找右子树中的最小节点，rightMin初始为待删节点的右子树的根节点
            Node rightMin = target.right;
            //右子树中最小节点的父节点
            Node rightMinParent = target;
            while (rightMin.left != null) {
                rightMinParent = rightMin;
                rightMin = rightMin.left;
            }
            target.data = rightMin.data;
            target = rightMin;
            parent = rightMinParent;
        }

        //删除的节点是叶子节点或仅有一个子节点
        Node child;
        if (target.left != null) {
            child = target.left;
        } else if (target.right != null) {
            child = target.right;
        } else {
            child = null;
        }

        //删除的是根节点
        if (parent == null) {
            tree=child;
        } else if (parent.left == null) {
            parent.left = child;
        } else {
            parent.right=child;
        }

    }


    public static class Node {

        private int data;

        private Node left;

        private Node right;

        public Node(int data) {
            this.data = data;
        }
    }

}
