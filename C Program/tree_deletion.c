// Including necessary header files
#include <stdio.h>
#include <stdlib.h>

// Structure for a binary tree node
struct TreeNode {
    int data;
    struct TreeNode* left;
    struct TreeNode* right;
};

// Function to create a new node
struct TreeNode* createNode(int value) {
    struct TreeNode* newNode = (struct TreeNode*)malloc(sizeof(struct TreeNode));
    if (newNode != NULL) {
        newNode->data = value;
        newNode->left = NULL;
        newNode->right = NULL;
    }
    return newNode;
}

// Function to insert a node into the binary search tree
struct TreeNode* insertNode(struct TreeNode* root, int value) {
    if (root == NULL) {
        return createNode(value);
    }

    if (value < root->data) {
        root->left = insertNode(root->left, value);
    } else if (value > root->data) {
        root->right = insertNode(root->right, value);
    }

    return root;
}

// Function to find the minimum value node in a BST
struct TreeNode* findMinValueNode(struct TreeNode* node) {
    while (node->left != NULL) {
        node = node->left;
    }
    return node;
}

// Function to delete a node with a given value from the binary search tree
struct TreeNode* deleteNode(struct TreeNode* root, int value) {
    if (root == NULL) {
        return root; // Value not found, return as is
    }

    if (value < root->data) {
        root->left = deleteNode(root->left, value);
    } else if (value > root->data) {
        root->right = deleteNode(root->right, value);
    } else {
        // Node with only one child or no child
        if (root->left == NULL) {
            struct TreeNode* temp = root->right;
            free(root);
            return temp;
        } else if (root->right == NULL) {
            struct TreeNode* temp = root->left;
            free(root);
            return temp;
        }

        // Node with two children: Get the inorder successor (smallest in the right subtree)
        struct TreeNode* temp = findMinValueNode(root->right);

        // Copy the inorder successor's content to this node
        root->data = temp->data;

        // Delete the inorder successor
        root->right = deleteNode(root->right, temp->data);
    }

    return root;
}

// Function to perform in-order traversal and print elements in sorted order
void inOrderTraversal(struct TreeNode* root) {
    if (root != NULL) {
        inOrderTraversal(root->left);
        printf("%d ", root->data);
        inOrderTraversal(root->right);
    }
}

// Function to free the memory allocated for the binary tree
void freeTree(struct TreeNode* root) {
    if (root != NULL) {
        freeTree(root->left);
        freeTree(root->right);
        free(root);
    }
}

int main() {
    struct TreeNode* root = NULL;
    int nodeValue;
    char choice;

    // Insert nodes into the binary search tree
    do {
        printf("Input a value to insert into the binary search tree (enter 0 to stop): ");
        scanf("%d", &nodeValue);

        if (nodeValue != 0) {
            root = insertNode(root, nodeValue);
        }

    } while (nodeValue != 0);

    // Perform in-order traversal and print elements in sorted order
    printf("\nIn-order Traversal (Sorted Order) of the Binary Search Tree: ");
    inOrderTraversal(root);
    printf("\n");

    // Delete nodes from the binary search tree
    do {
        printf("Input a value to delete from the binary search tree (enter 0 to stop): ");
        scanf("%d", &nodeValue);

        if (nodeValue != 0) {
            root = deleteNode(root, nodeValue);
            printf("In-order Traversal after deleting %d: ", nodeValue);
            inOrderTraversal(root);
            printf("\n");
        }

    } while (nodeValue != 0);

    // Free allocated memory
    freeTree(root);

    return 0;
}
