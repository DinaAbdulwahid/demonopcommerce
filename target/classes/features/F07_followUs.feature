@smoke
Feature: users could open followUs links

  Scenario: user opens facebook link
    When user opens facebook link
   Then facebook url is opened in new tab

  Scenario: user opens twitter link
   When user opens twitter link
   Then twitter url is opened in new tab

  Scenario: user opens Rss link
    When user opens rss link
    Then rss url is opened

 Scenario: user opens youtube link
   When user opens youtube link
   Then youtube url is opened in new tab