CustomerManager customerManager = new CustomerManager(new Customer(), new CarCreditManager());
customerManager.GiveCredit();

Console.ReadLine();


class CreditManager
{
    public void Calculate()
    {
        Console.WriteLine("Hesaplandı");
    }

    public void Save()
    {
        Console.WriteLine("Kredi verildi");
    }
}

interface ICreditManager
{
    void Calculate();
    void Save(); 
}

abstract class BaseCreditManager : ICreditManager
{
    public abstract void Calculate();

    public virtual void Save()
    {
        Console.WriteLine("Kaydedildi");
    }
}

class TeacherCreditManager : BaseCreditManager, ICreditManager
{
    public override void Calculate()
    {
        Console.WriteLine("Öğretmen kredisi hesaplandı");
    }

    public override void Save()
    {
        //
        base.Save();
        //
    }
}

class MilitaryCreditManager : BaseCreditManager, ICreditManager
{
    public override void Calculate()
    {
        Console.WriteLine("Asker kredisi hesaplandı");
    }

  
}

class CarCreditManager : BaseCreditManager, ICreditManager
{
    public override void Calculate()
    {
        Console.WriteLine("Araba kredisi hesaplandı");
    }

}


class Customer
{
    public Customer()
    {
        Console.WriteLine("Müşteri nesnesi başlatıldı");
    }

    public int Id { get; set; }
    public string City { get; set; }
}

class Person : Customer
{
    public string FirstName { get; set; }
    public string LastName { get; set; }
    public string NationalIdentity { get; set; }
}

class Company : Customer
{
    public string CompanyName { get; set; }
    public string TaxNumber { get; set; }
}


class CustomerManager
{
    private Customer _customer;
    private ICreditManager _creditManager;

    public CustomerManager(Customer customer1, ICreditManager creditManager)
    {
        _customer = customer1;
        _creditManager = creditManager;
    }

    public void Save()
    {
        Console.WriteLine("Müşteri kaydedildi: ");
    }

    public void Delete()
    {
        Console.WriteLine("Müşteri silindi: ");
    }

    public void GiveCredit()
    {
        _creditManager.Calculate();
        Console.WriteLine("Kredi verildi");
    }
}