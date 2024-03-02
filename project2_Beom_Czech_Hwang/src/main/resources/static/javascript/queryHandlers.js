// queryHandlers.js

/**
 * Handles the initialization of event listeners for query buttons and dynamic content updates.
 * It listens for the DOMContentLoaded event to ensure the DOM is fully loaded before attaching
 * event listeners to elements. Supports fetching and displaying results for queries 1 to 4, and
 * specifically handles POST requests for queries 5 and 6 with input form data.
 */

// Query 1 to 4

/**
 * Attaches click event listeners to query buttons (Query1, Query2, Query3, Query4).
 * On button click, fetches query results and dynamically updates the content inside
 * the "sql-container" element with a generated table of results.
 */
document.addEventListener("DOMContentLoaded", (event) => {
  ["Query1", "Query2", "Query3", "Query4"].forEach((id) => {
    document.getElementById(id).addEventListener("click", function () {
      document.getElementById("spinner").style.display = "block"; // Show spinner
      fetch(`/dynamic/${id.toLowerCase()}`)
        .then((response) => response.json())
        .then((data) => {
          document.getElementById("spinner").style.display = "none"; // Hide spinner
          const container = document.getElementById("sql-container");
          container.innerHTML = ""; // Clear previous results

          // Create a table
          const table = document.createElement("table");
          container.appendChild(table);

          // Add table head
          const thead = document.createElement("thead");
          table.appendChild(thead);

          // Assuming the data is an array of objects, use the keys of the first object for the table headers
          const headerRow = document.createElement("tr");
          thead.appendChild(headerRow);
          if (data.length > 0) {
            Object.keys(data[0]).forEach((key) => {
              const th = document.createElement("th");
              th.textContent = key;
              headerRow.appendChild(th);
            });
          }

          // Add table body
          const tbody = document.createElement("tbody");
          table.appendChild(tbody);

          // Add rows to table body
          data.forEach((row) => {
            const tr = document.createElement("tr");
            tbody.appendChild(tr);
            Object.values(row).forEach((value) => {
              const td = document.createElement("td");
              td.textContent = value;
              tr.appendChild(td);
            });
          });
        })
        .catch((error) => {
          console.error("Error:", error);
          document.getElementById("spinner").style.display = "none"; // Hide spinner
        });
    });
  });
});
// Query 1 to 4 end

// Query 5

/**
 * Specifically handles the click event for the "Query5" button, including reading
 * input values, making a POST request with those values, and displaying the results.
 */
document.addEventListener("DOMContentLoaded", () => {
  document.getElementById("Query5").addEventListener("click", function () {
    let fullName1 = document.getElementById("Query5EmployeeName1").value.split(" ");
    let lastName1 = fullName1.pop(); // Assuming the last part is the last name
    let firstName1 = fullName1.join(" "); // The rest is considered the first name

    let fullName2 = document.getElementById("Query5EmployeeName2").value.split(" ");
    let lastName2 = fullName2.pop(); // Same assumption for the second name
    let firstName2 = fullName2.join(" ");

    document.getElementById("spinner").style.display = "block";

    const payload = {
      firstName1: firstName1,
      lastName1: lastName1,
      firstName2: firstName2,
      lastName2: lastName2,
    };

    fetch("/dynamic/query5", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(payload),
    })
    .then(response => response.json())
    .then(data => {
      document.getElementById("spinner").style.display = "none"; // Hide spinner once data is received

      const container = document.getElementById("sql-container");
      container.innerHTML = ""; // Clear previous results

      // Check if any data is returned
      if (data && data.length > 0) {
        const table = document.createElement("table");
        const thead = document.createElement("thead");
        const tbody = document.createElement("tbody");
        table.appendChild(thead);
        table.appendChild(tbody);

        // Create header row
        const headerRow = document.createElement("tr");
        Object.keys(data[0]).forEach(key => {
          const th = document.createElement("th");
          th.textContent = key;
          headerRow.appendChild(th);
        });
        thead.appendChild(headerRow);

        // Populate the table body with rows
        data.forEach(row => {
          const tr = document.createElement("tr");
          Object.values(row).forEach(value => {
            const td = document.createElement("td");
            td.textContent = value;
            tr.appendChild(td);
          });
          tbody.appendChild(tr);
        });

        container.appendChild(table);
      } else {
        // Handle case where no data is found
        container.textContent = "No results found.";
      }
    })
    .catch(error => {
      console.error("Error:", error);
      document.getElementById("spinner").style.display = "none";
      const container = document.getElementById("sql-container");
      container.textContent = "An error occurred while processing the request.";
    });
  });
});


// Query 5 end

// Query 6

/**
 * Handles the "Query6" button click event in a similar manner to "Query5", by
 * making a POST request with form inputs and displaying fetched results.
 */
document.addEventListener("DOMContentLoaded", () => {
  document.getElementById("Query6").addEventListener("click", function () {
    let fullName1 = document.getElementById("Query6EmployeeName1").value.split(" ");
    let lastName1 = fullName1.pop(); // Assuming the last part is the last name
    let firstName1 = fullName1.join(" "); // The rest is considered the first name

    let fullName2 = document.getElementById("Query6EmployeeName2").value.split(" ");
    let lastName2 = fullName2.pop(); // Same assumption for the second name
    let firstName2 = fullName2.join(" ");

    document.getElementById("spinner").style.display = "block";

    const payload = {
      firstName1: firstName1,
      lastName1: lastName1,
      firstName2: firstName2,
      lastName2: lastName2,
    };

    fetch("/dynamic/query6", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(payload),
    })
    .then(response => response.json())
    .then(data => {
      document.getElementById("spinner").style.display = "none"; // Hide spinner once data is received

      const container = document.getElementById("sql-container");
      container.innerHTML = ""; // Clear previous results

      // Check if any data is returned
      if (data && data.length > 0) {
        const table = document.createElement("table");
        const thead = document.createElement("thead");
        const tbody = document.createElement("tbody");
        table.appendChild(thead);
        table.appendChild(tbody);

        // Create header row
        const headerRow = document.createElement("tr");
        Object.keys(data[0]).forEach(key => {
          const th = document.createElement("th");
          th.textContent = key;
          headerRow.appendChild(th);
        });
        thead.appendChild(headerRow);

        // Populate the table body with rows
        data.forEach(row => {
          const tr = document.createElement("tr");
          Object.values(row).forEach(value => {
            const td = document.createElement("td");
            td.textContent = value;
            tr.appendChild(td);
          });
          tbody.appendChild(tr);
        });

        container.appendChild(table);
      } else {
        // Handle case where no data is found
        container.textContent = "No results found.";
      }
    })
    .catch(error => {
      console.error("Error:", error);
      document.getElementById("spinner").style.display = "none";
      const container = document.getElementById("sql-container");
      container.textContent = "An error occurred while processing the request.";
    });
  });
});

