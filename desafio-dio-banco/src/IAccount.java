public interface IAccount {
    void withdraw(double value);

    void deposit(double value);

    void tranfer(double value, IAccount destinationAccount);

    void statement();
}
