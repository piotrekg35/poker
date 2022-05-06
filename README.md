# Zasady:
Jedna Rozgrywka składa się z następujących etapów:  
1)Wejście do gry. Ante zawsze wynosi 100.  
2)Licytacja.  
3)Wymiana od 0 do 5 kart.  
4)Licytacja.  
5)Sprawdzenie kto wygrał.  
Jedna gra może składać się z wielu rozgrywek.  

# Sposób uruchomienia programu:
Będąc w folderze multi-module należy wpisać w terminalu: mvn package  
Aby uruchomić serwer należy wpisać w terminalu: java -jar .\poker-server\target\poker-server-1.0-jar-with-dependencies.jar 2  
Gdzie 2 oznacza liczbę graczy. Można ją zastąpić 3 lub 4. Wtedy w grę będzie grało odpowiednio więcej graczy.  
Aby uruchomić klienta należy wpisać w terminalu: java -jar .\poker-client\target\poker-client-1.0-jar-with-dependencies.jar  

# Komunikacja  
Pierwszy komunikat od serwera:  

Welcome Player #1  
Ante is 100  
Your Money: 1000  
Your cards:  
  
Commands:   
Q-Quit  
J-Join  

Gdy gracz wpisze J to gracz dołącza do gry. Gdy gracz wpisze J to gracz odchodzi z gry.  
Gdy wszyscy gracze dołączą to otrzymują kolejny komunikat od serwera. Przykładowy komunikat:  
  
You joined the game!  
100 has been taken from  you!  
  
Prize: 200  
Your Money: 900  
Your cards:  
1. TEN of SPADES  
2. QUEEN of SPADES  
3. NINE of SPADES  
4. ACE of HEARTS  
5. QUEEN of DIAMONDS  

Prize określa jaką nagrode otrzyma zwycięzca. Your Money to pieniądze posiadane przez gracza. Początkowo każdy otrzymuje po 1000 a po wejściu do gry oddaje 100. Your cards to karty gracza.  
Zaczyna się licytcja. Gracze po kolei otrzymują komunikat dotyczący licytacji. Przykładowy komunikat:  
  
Betting starts. Betting: 0  
Commands:  
B-Bet  
P-Pass  

Po wpisaniu B gracz musi wpisać ile pieniędzy chce dołożyć do puli. Musi być to liczba nie mniejsza od Betting.  
Wszyscy gracze muszą dołożyć tyle samo pieniędzy do puli albo muszą spasować wpisując P.  
Następnie gracze mogą wymienić od 0 do 5 kart. Otrzymują komunikat:  

How many cards do you want to change? Choose numbers from 0 to 5.  

Gracz musi wpisać liczbę z przedziału 0-5. Następnie serwer pyta które karty gracz chce wymienić:  

Which cards do you want to change? Choose numbers from 1 to 5.  

Gracz musi wpisać liczby z przedziału 0-5. Liczby są indeksami kart do wymiany.  
Następnie zaczyna się druga licytacja. Gracze po kolei otrzymują komunikat. Przykładowy komunikat:  

Betting starts. Betting: 0  
Commands:  
B-Bet  
P-Pass  

Po wpisaniu B gracz musi wpisać ile pieniędzy chce dołożyć do puli. Musi być to liczba nie mniejsza od Betting.  
Wszyscy gracze muszą dołożyć tyle samo pieniędzy do puli albo muszą spasować wpisując P. Następnie otrzymują komunikat o wygranej lub przegranej.  
Przykładowy komunikat:  

YOU LOST!  
YOUR MONEY: 900  




