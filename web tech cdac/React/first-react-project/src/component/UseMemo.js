import React from 'react'

export const UseMemo = (props) => {
    console.log("memo render");
  return (
            <div>
            <p>Item:{props.newItem}</p>
            </div>
         )
}
export default React.memo(UseMemo);
