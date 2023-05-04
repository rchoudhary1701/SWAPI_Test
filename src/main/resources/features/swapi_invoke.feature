Feature: Invoke SWAPI Get call

  Scenario Outline: Get Call API for SWAPI

    Given hit the API url with "<Resource>"
    Then  validate the status code <StatusCode>

    Examples:

      | Resource          | StatusCode |
      | /api/species/3/   | 200        |
      | /api/people/3/    | 200        |
      | /api/starships/9/ | 200        |

