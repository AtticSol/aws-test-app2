# aws-test-app2

//run below commands to setup java 11 and code-deploy agent

sudo yum update
sudo yum install ruby
sudo yum install wget
cd /home/ec2-user
wget https://aws-codedeploy-eu-central-1.s3.eu-central-1.amazonaws.com/latest/install
//wget https://aws-codedeploy-us-east-1.s3.us-east-1.amazonaws.com/latest/install
chmod +x ./install
sudo ./install auto
sudo yum install -y python-pip
sudo pip install awscli
//sudo amazon-linux-extras install java-openjdk11
sudo yum install java-17-amazon-corretto

//verify installation
sudo service codedeploy-agent status
java -version
