# InfoBook Android Application

InfoBook is an Android application designed to provide users with information about various topics such as countries, leaders, museums, and wonders of the world. It offers a user-friendly interface and seamless navigation to explore different categories of information.

## Features

- **Home Screen:** The main screen of the app displays different categories like countries, leaders, museums, and wonders of the world using a RecyclerView with a grid layout. Each category is represented by an image and a title.

- **Category Details:** Upon clicking on a category card, users are directed to a specific activity or fragment corresponding to that category.

- **Countries Section:** The Countries section features a ViewPager2 with tabs for different countries such as the United Kingdom, France, and Italy. Each tab displays information about a specific country, including relevant images and descriptions.

- **Wonders Section:** The Wonders section utilizes a ViewPager2 to showcase different wonders of the world.

- **Leaders & Museums Section:** Those sections enable exploration of notable leaders and significant museums from around the world, offering insights into historical figures and cultural institutions.

- **Reusable Adapters:** The app employs reusable RecyclerView adapters to efficiently manage the display of data for different categories.

## Technologies Used

- **Java:** The primary programming language used for Android app development.
- **Android SDK:** Leveraging various Android components and libraries for UI design and functionality.
- **Picasso:** A powerful image loading library for handling image resources within the app.
- **ViewPager2 and TabLayout:** Utilized for creating swipeable tabs and managing fragments for the Countries and Wonders sections.
- **RecyclerView:** Employed for displaying a grid layout of category cards on the home screen.

## Future Enhancements

- **Additional Categories:** Expand the app's functionality by adding more categories such as historical events, famous landmarks, or natural wonders.
- **Improved UI/UX:** Enhance the user interface with custom animations, transitions, and polished designs for a more engaging experience.
- **Backend Integration:** Integrate with backend services or APIs to fetch real-time data for categories like current world leaders, trending museums, etc.
- **Localization:** Support multiple languages to cater to a diverse user base and enhance accessibility.
