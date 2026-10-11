package CircularDoubly;

public class CircularDoubly {
	
	Dnode root, last; // first and last node

    // Insert Left
    void insert_left(int data)
    {
        Dnode n = new Dnode(data);

        if (root == null)
        {
            root = _____;
            last = _____;

            root.left = _____;
            last.right = _____;
        }
        else
        {
            n.right = _____;
            n.left = _____;

            root.left = _____;
            last.right = _____;

            root = _____;
        }
    }

    // Insert Right
    void insert_right(int data)
    {
        Dnode n = new Dnode(data);

        if (root == null)
        {
            root = _____;
            last = _____;

            root.left = _____;
            last.right = _____;
        }
        else
        {
            n.left = _____;
            n.right = _____;

            last.right = _____;
            root.left = _____;

            last = _____;
        }
    }

    // Delete Left
    void delete_left()
    {
        if (root == null)
            System.out.print("\nEmpty List");
        else
        {
            Dnode t = _____;

            if (root == last)
            {
                root = _____;
                last = _____;
            }
            else
            {
                root = root._____;

                root.left = _____;
                last.right = _____;
            }

            System.out.print("\n" + t.data + " deleted");
        }
    }

    // Delete Right
    void delete_right()
    {
        if (root == null)
            System.out.print("\nEmpty List");
        else
        {
            Dnode t = _____;

            if (root == last)
            {
                root = _____;
                last = _____;
            }
            else
            {
                last = last._____;

                last.right = _____;
                root.left = _____;
            }

            System.out.print("\n" + t.data + " deleted");
        }
    }

    // Print Forward
    void print_list()
    {
        if (root == null)
            System.out.print("\nList Empty");
        else
        {
            Dnode t = _____;
            System.out.print("NULL <-> ");

            do
            {
                System.out.print(t.data + " <-> ");
                t = t._____;
            }
            while (t != _____);

            System.out.print("ROOT");
        }
    }

    // Print Reverse
    void print_list_rev()
    {
        if (root == null)
            System.out.print("\nList Empty");
        else
        {
            Dnode t = _____;
            System.out.print("NULL <-> ");

            do
            {
                System.out.print(t.data + " <-> ");
                t = t._____;
            }
            while (t != _____);

            System.out.print("LAST");
        }
    }

}
