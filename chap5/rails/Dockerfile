FROM ruby:3.0.4
RUN apt-get update -qq
RUN curl -fsSL https://dev.nodesource.com/setup_lts.x | bash - && apt-get install -y nodejs
RUN npm instal - g yarn

WORKDIR /samplerails
COPY Gemfile Gemfile.lock /samplerails/
RUN bundle install
CMD [ "rails", "s", "-b", "0.0.0.0" ]
