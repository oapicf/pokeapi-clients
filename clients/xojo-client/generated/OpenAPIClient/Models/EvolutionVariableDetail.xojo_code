#tag Class
Protected Class EvolutionVariableDetail

	#tag Property, Flags = &h0
		#tag Note
			The identifier for this resource.
		#tag EndNote
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name for this resource.
		#tag EndNote
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The symbol used for this variable in evolution condition expressions.
		#tag EndNote
		symbol As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The data type of this variable.
		#tag EndNote
		data_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The source of the variable value.
		#tag EndNote
		source As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The version group in which this variable was introduced.
		#tag EndNote
		version_group As OpenAPIClient.Models.VersionGroupSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name of this resource listed in different languages.
		#tag EndNote
		names() As OpenAPIClient.Models.EvolutionVariableName
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The description of this resource listed in different languages.
		#tag EndNote
		descriptions() As OpenAPIClient.Models.EvolutionVariableDescription
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="symbol"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="data_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="source"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="version_group"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="VersionGroupSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="names"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="EvolutionVariableName"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="descriptions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="EvolutionVariableDescription"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


