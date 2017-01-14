package datastructures.tree;

public class BinarySearchTree<T> {
  TreeNode<T> root = null;

  public BinarySearchTree() {

  }

  public TreeNode<T> insertRoot(T data) {
    this.root = new TreeNode<T>(data);
    return this.root;
  }

  public TreeNode<T> insert(TreeNode<T> root, T data) {
    if (root == null) {
      root = new TreeNode<T>(data);
    } else {
      if (root.compareTo(data) <= 0) {
        root.left = insert(root.left, data);
      } else {
        root.right = insert(root.right, data);
      }
    }
    return root;
  }

  public String findPath(TreeNode<T> root, T data) {
    if (root == null) {
      return "not found";
    }
    String path = "";
    if (root.data.equals(data)) {
      return root.data.toString();
    } else {
      if (root.compareTo(data) <= 0) {
        path += (root.data) + "->left->" + findPath(root.left, data);
      } else {
        path += (root.data) + "->right->" + findPath(root.right, data);
      }
    }

    return path;
  }

  public void inOrder(TreeNode<T> root) {
    if (root != null) {
      System.out.println(root.data);
      inOrder(root.left);
      inOrder(root.right);
    }
  }

  public void preOrder(TreeNode<T> root) {
    if (root != null) {
      preOrder(root.left);
      System.out.println(root.data);
      preOrder(root.right);
    }
  }

  public void postOrder(TreeNode<T> root) {
    if (root != null) {
      preOrder(root.left);
      preOrder(root.right);
      System.out.println(root.data);
    }
  }

  public TreeNode<T> getRoot() {
    return this.root;
  }
}