
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="domain.Game" %>
<!DOCTYPE html>

<%

     ArrayList<Game>games = new ArrayList<>();
    Game GTA = new Game(1, "GTA V","Rockstar Games", 10, 18,"September 17 2013" );
    games.add(GTA);
    Game Fifa = new Game(2, "FIFA 22", "EA Sports", 7, 3, "September 26 2021");
    games.add(Fifa);
    Game Overwatch = new Game(3, "Overwatch", "Blizzard", 7, 16, "Unkown");
    games.add(Overwatch);

%>
<html>
<head>
    <title>Overzicht</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="CSS.css" >

</head>
<body>


<header>

<nav class="navbar">
    <ul>
        <li> <a href="index.jsp">Home</a></li>
        <li><a href="voeg toe.jsp">Voeg toe </a></li>
        <li><a href="overzicht.jsp">Overzicht</a></li>
    </ul>
</nav>


</header>

<main>
<p>
    Hier is een overzicht van games die aangeraden zijn om te spelen.

</p>

    <table>

        <tr>
            <th>Naam</th>
            <th>Developer</th>
            <th>IGN rating</th>
            <th>PEGI</th>
            <th>Release Date</th>
        </tr>


        <%for(Game game : games ){%>
        <tr>
            <td><%=game.getNaam() %></td>
            <td><%= game.getDevelopers()%></td>
            <td><%= game.getIGN()%></td>
            <td><%= game.getPegi()%></td>
            <td><%=game.getRelease()%></td>

        </tr>
        <%}%>



    </table>
</main>

<footer>Aaron Abbey | Webontwikkeling 2 - 2021-2022</footer>

</body>
</html>
