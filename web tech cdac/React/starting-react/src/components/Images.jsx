import React from "react";

import img1 from "../assets/crousel_Image1.jpg";
import img2 from "../assets/crousel_Image2.jpg";
import img3 from "../assets/crousel_Image3.jpg";

const Images = () => {
  return (
    <div className="w-full p-5">

      <div className="grid grid-cols-3 gap-4">

        {/* Row 1 */}
        <img
          src={img1}
          alt="image1"
          className="w-full h-64 object-cover"
        />

        <img
          src={img2}
          alt="image2"
          className="w-full h-64 object-cover"
        />

        <img
          src={img3}
          alt="image3"
          className="w-full h-64 object-cover"
        />

        {/* Row 2 */}
        <img
          src={img1}
          alt="image1"
          className="w-full h-64 object-cover"
        />

        <img
          src={img2}
          alt="image2"
          className="w-full h-64 object-cover"
        />

        <img
          src={img3}
          alt="image3"
          className="w-full h-64 object-cover"
        />

        {/* Row 3 */}
        <img
          src={img1}
          alt="image1"
          className="w-full h-64 object-cover"
        />

        <img
          src={img2}
          alt="image2"
          className="w-full h-64 object-cover"
        />

        <img
          src={img3}
          alt="image3"
          className="w-full h-64 object-cover"
        />

      </div>

    </div>
  );
};

export default Images;