import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Country> countries = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int country_num = Integer.parseInt(st.nextToken());
            int gold = Integer.parseInt(st.nextToken());
            int silver = Integer.parseInt(st.nextToken());
            int bronze = Integer.parseInt(st.nextToken());
            Country country = new Country(country_num, gold, silver, bronze);
            countries.add(country);
        }

        countries.sort(Comparator.comparingInt(
                Country::getGold)
                    .thenComparingInt(Country::getSilver)
                    .thenComparingInt(Country::getBronze)
                        .thenComparing(country -> country.getCountry() == K ? 1 : -1)
                .reversed()
        );

        for (int i = 0; i < countries.size(); i++) {
            if (countries.get(i).getCountry() == K) {
                System.out.println(i + 1);
            }
        }
    }

    static class Country {
        int country;
        int gold;
        int silver;
        int bronze;

        public Country(int country, int gold, int silver, int bronze) {
            this.country = country;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
        }

        public int getCountry() {
            return country;
        }
        public int getGold() {
            return gold;
        }
        public int getSilver() {
            return silver;
        }
        public int getBronze() {
            return bronze;
        }
    }
}