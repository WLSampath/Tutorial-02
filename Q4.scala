//Q:: 4 > 1
object Q4{
    def main(args: Array[String]) ={
        val salaryForWH = 250.00f
        val salaryForOTH = 85.00f
        val typicalWHPerWeek = 40
        val typicalOTHPerWeek = 30
        val taxRate = 0.12f
        println("iurifguhtih")
        def ChekValid(workingHours: Int, otHours: Int): Boolean = workingHours >= typicalWHPerWeek && otHours >= typicalOTHPerWeek
        def TotalSalary(workingHours: Int, otHours: Int): Float = (workingHours * salaryForWH) + (otHours * salaryForOTH)
        def Tax(totalOfSalary: Float): Float = totalOfSalary * taxRate
        def TakeHomeSalary(totalOfSalary: Float, tax: Float) : Float = totalOfSalary - tax

        def CalculateSalary(workingHours: Int, otHours: Int) : Float = if (ChekValid(workingHours, otHours)) {
        val totalOfSalary = TotalSalary(workingHours, otHours)
        val tax = Tax(totalOfSalary)
        TakeHomeSalary(totalOfSalary, tax)
        
} else {

  0
}

        CalculateSalary(60, 60)


//*************************************

//Q:: 4 > 2

        val priceChange = 5

        def NumOfPeople(priceChange: Int): Int = -1 * (priceChange * 20 / 5) + 120
        def TicketCost(priceChange: Int): Float = 15.0f + priceChange
        def Income(numberOfPeople: Int, ticketPrice: Float): Float = ticketPrice * numberOfPeople
        def Cost(numberOfPeople: Int): Float = 500.00f + (3.00f * numberOfPeople)
        def Profit(income: Float, cost: Float): Float = income - cost
        def CalculateProfit(numberOfPeople: Int, ticketPrice: Float) : Float = Profit(Income(numberOfPeople, ticketPrice), Cost(numberOfPeople))

        def FindPrice(priceIncrese: Int, priceDecrese: Int): Float = {
        val numberOfPeopleIncreased = NumOfPeople(priceIncrese)
        val ticketPriceIncreased = TicketCost(priceIncrese)
        val profitIncreased = CalculateProfit(numberOfPeopleIncreased, ticketPriceIncreased)

        val numberOfPeopleDecreased = NumOfPeople(priceDecrese)
        val ticketCostDecreased = TicketCost(priceDecrese)
        val profitDecreased = CalculateProfit(numberOfPeopleDecreased, ticketCostDecreased)

            if(profitIncreased >= profitDecreased) ticketPriceIncreased else ticketCostDecreased
}
             FindPrice(5,-5)
  }
}