#tag Class
Protected Class AbilityFlavorText

	#tag Property, Flags = &h0
		flavor_text As String
	#tag EndProperty


	#tag Property, Flags = &h0
		language As OpenAPIClient.Models.LanguageSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		version_group As OpenAPIClient.Models.VersionGroupSummary
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
			Name="flavor_text"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="language"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="LanguageSummary"
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
	#tag EndViewBehavior
End Class
#tag EndClass


