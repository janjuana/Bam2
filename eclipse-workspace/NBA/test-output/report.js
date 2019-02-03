$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GetStats.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author:TeamJanjua"
    }
  ],
  "line": 2,
  "name": "GetStats",
  "description": "",
  "id": "getstats",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "Given NBA logo is displayed",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 6,
  "name": "Get Nba Traditional Stats",
  "description": "",
  "id": "getstats;get-nba-traditional-stats",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I select traditional stats",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I get NBA Traditional stats into excel",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "GetStats.i_select_traditional_stats()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GetStats.i_get_NBA_Traditional_stats_into_excel()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GetStats.i_close_browser()"
});
formatter.result({
  "status": "skipped"
});
});