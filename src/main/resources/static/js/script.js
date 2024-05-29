// Vänta tills hela sidan har laddats innan JavaScript-koden körs
document.addEventListener("DOMContentLoaded", function() {
    // Hämta knappen med id "rsvpButton"
    var rsvpButton = document.getElementById("rsvpButton");

    // Lägg till en händelselyssnare för klickhändelse på knappen
    rsvpButton.addEventListener("click", function() {
        // Hämta modalen med id "myModal"
        var modal = document.getElementById("myModal");

        // Visa modalen genom att ändra dess display-attribut till "block"
        modal.style.display = "block";
    });

    // Hämta stängknappen med klass "close"
    var closeButton = document.querySelector(".close");

    // Lägg till en händelselyssnare för klickhändelse på stängknappen
    closeButton.addEventListener("click", function() {
        // Hämta modalen med id "myModal"
        var modal = document.getElementById("myModal");

        // Dölj modalen genom att ändra dess display-attribut till "none"
        modal.style.display = "none";
    });

    // Lägg till en händelselyssnare för klickhändelse på fönstret
    window.addEventListener("click", function(event) {
        // Hämta modalen med id "myModal"
        var modal = document.getElementById("myModal");

        // Kontrollera om användaren klickade utanför modalens innehåll
        if (event.target === modal) {
            // Dölj modalen genom att ändra dess display-attribut till "none"
            modal.style.display = "none";
        }
    });
});
