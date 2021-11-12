export function decodedValue(...bandColors: string[]) {
  let answer: string = "";
  let i: number = 0;
  while (i < 2) {
    console.log(bandColors[0][i]);
    switch(bandColors[0][i]) { 
      case "black": { 
        answer += "0";
        break; 
      }
      case "brown": { 
        answer += "1";
        break; 
      }
      case "red": { 
        answer += "2";
        break; 
      }
      case "orange": { 
        answer += "3";
        break; 
      }
      case "yellow": { 
        answer += "4";
        break; 
      }
      case "green": { 
        answer += "5";
        break; 
      }
      case "blue": { 
        answer += "6";
        break; 
      }
      case "violet": { 
        answer += "7";
        break; 
      }
      case "grey": { 
        answer += "8";
        break; 
      }
      case "white": { 
        answer += "9";
        break; 
      }
      default: { break; }
    }
    i++;
  }
  return Number(answer);
}
