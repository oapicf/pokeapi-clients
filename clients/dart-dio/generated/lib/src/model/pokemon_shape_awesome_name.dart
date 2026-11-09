//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/language_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_shape_awesome_name.g.dart';

/// PokemonShapeAwesomeName
///
/// Properties:
/// * [awesomeName] - The localized \"scientific\" name for an API resource in a specific language.
/// * [language] - The language this \"scientific\" name is in.
@BuiltValue()
abstract class PokemonShapeAwesomeName implements Built<PokemonShapeAwesomeName, PokemonShapeAwesomeNameBuilder> {
  /// The localized \"scientific\" name for an API resource in a specific language.
  @BuiltValueField(wireName: r'awesome_name')
  String get awesomeName;

  /// The language this \"scientific\" name is in.
  @BuiltValueField(wireName: r'language')
  LanguageSummary get language;

  PokemonShapeAwesomeName._();

  factory PokemonShapeAwesomeName([void updates(PokemonShapeAwesomeNameBuilder b)]) = _$PokemonShapeAwesomeName;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonShapeAwesomeNameBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonShapeAwesomeName> get serializer => _$PokemonShapeAwesomeNameSerializer();
}

class _$PokemonShapeAwesomeNameSerializer implements PrimitiveSerializer<PokemonShapeAwesomeName> {
  @override
  final Iterable<Type> types = const [PokemonShapeAwesomeName, _$PokemonShapeAwesomeName];

  @override
  final String wireName = r'PokemonShapeAwesomeName';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonShapeAwesomeName object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'awesome_name';
    yield serializers.serialize(
      object.awesomeName,
      specifiedType: const FullType(String),
    );
    yield r'language';
    yield serializers.serialize(
      object.language,
      specifiedType: const FullType(LanguageSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonShapeAwesomeName object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonShapeAwesomeNameBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'awesome_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.awesomeName = valueDes;
          break;
        case r'language':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(LanguageSummary),
          ) as LanguageSummary;
          result.language.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonShapeAwesomeName deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonShapeAwesomeNameBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}


